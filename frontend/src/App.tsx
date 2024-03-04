import "@mantine/core/styles.css";
import { createTheme, MantineProvider } from "@mantine/core";
import { Notifications } from "@mantine/notifications";
import "@mantine/notifications/styles.css";
import TodoOverview from "./components/TodoOverview.tsx";

const App = () => {
  const theme = createTheme({});

  return (
    <MantineProvider theme={theme}>
      <Notifications />
      <TodoOverview />
    </MantineProvider>
  );
};

export default App;
