import { Collapse, Group, Title, UnstyledButton } from "@mantine/core";
import { useState } from "react";
import Todo, { TodoType } from "./Todo.tsx";
import { IconChevronDown, IconChevronUp, IconList } from "@tabler/icons-react";
import styles from "./TodoList.module.scss";

export type TodoListType = {
  id: number;
  name: string;
  completed: boolean;
  todos: TodoType[];
};

type TodoListProps = {
  todoList: TodoListType;
};

const TodoList = ({ todoList }: TodoListProps) => {
  const { name, completed, todos } = todoList;

  const [isOpen, setIsOpen] = useState(true);

  return (
    <div className={styles.todoListContainer}>
      <UnstyledButton onClick={() => setIsOpen(!isOpen)}>
        <Group>
          <IconList />
          <Title order={3}>{name}</Title>
          {isOpen ? <IconChevronUp /> : <IconChevronDown />}
        </Group>
      </UnstyledButton>
      <Collapse className={styles.collapseContainer} in={isOpen}>
        {todos.map((todo) => {
          return <Todo todo={todo} />;
        })}
      </Collapse>
    </div>
  );
};

export default TodoList;
