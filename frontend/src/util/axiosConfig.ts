import axios, { AxiosInstance } from "axios";

const BASE_URL = "http://localhost:8080/todo-service";

export const axiosInstance: AxiosInstance = axios.create({
  baseURL: BASE_URL,
});
