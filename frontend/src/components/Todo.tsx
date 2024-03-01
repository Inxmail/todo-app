import { Checkbox, Group, Title } from "@mantine/core";
import styles from "./Todo.module.scss";

export type TodoType = {
  id: number;
  title: string;
  completed: boolean;
};

type TodoProps = {
  todo: TodoType;
};

const Todo = ({ todo }: TodoProps) => {
  const { id, title, completed } = todo;

  return (
    <>
      <Group className={styles.todoContainer}>
        <Checkbox color="yellow" />
        <Title order={4}>{title}</Title>
      </Group>
    </>
  );
};

export default Todo;
