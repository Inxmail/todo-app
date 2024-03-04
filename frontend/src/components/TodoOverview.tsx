import { Loader, Title } from "@mantine/core";
import TodoList, { TodoListType } from "./TodoList.tsx";
import { axiosInstance } from "../util/axiosConfig.ts";
import { useEffect, useState } from "react";
import styles from "./TodoOverview.module.scss";
import { notifications } from "@mantine/notifications";
import { IconX } from "@tabler/icons-react";

const TodoOverview = () => {
  const [todoListData, setTodoListData] = useState<TodoListType[] | undefined>(
    undefined,
  );

  const loadBackendData = () => {
    axiosInstance
      .get("/lists")
      .then(function (response) {
        setTodoListData(response.data);
      })
      .catch((error) =>
        notifications.show({
          color: "red",
          radius: "md",
          icon: <IconX />,
          withBorder: true,
          title: error.title,
          message: error.message,
        }),
      );
  };

  useEffect(() => {
    loadBackendData();
  }, []);

  return (
    <div className={styles.appContainer}>
      <Title order={1}>Todos App</Title>
      <div className={styles.listContainer}>
        {todoListData ? (
          todoListData.map((todoList: TodoListType) => (
            <TodoList key={todoList.id} todoList={todoList} />
          ))
        ) : (
          <Loader
            className={styles.loadingIcon}
            color="yellow"
            type="bars"
            size="xl"
          />
        )}
      </div>
    </div>
  );
};

export default TodoOverview;
