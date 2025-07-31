import axios from "axios";

const API_BASE_URL = "http://localhost:8081/api/products";

export const getAllProducts = () => axios.get(API_BASE_URL);
export const getProductById = (id) => axios.get(`${API_BASE_URL}/${id}`);
