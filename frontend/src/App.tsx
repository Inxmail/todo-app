import "@mantine/core/styles.css";
import { createTheme, MantineProvider } from "@mantine/core";
import { Notifications } from "@mantine/notifications";
import "@mantine/notifications/styles.css";

const App = () => {
  const theme = createTheme({});

  return (
    <MantineProvider theme={theme}>
      <Notifications />
      {/* TODO: add app here */}
    </MantineProvider>
  );
};

export default App;
