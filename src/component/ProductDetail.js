import React, { useEffect, useState } from "react";
import { useParams, Link } from "react-router-dom";
import { getProductById } from "../service/api";

const ProductDetail = () => {
  const { id } = useParams();
  const [product, setProduct] = useState(null);

  useEffect(() => {
    getProductById(id)
      .then((res) => setProduct(res.data))
      .catch((err) => console.error(err));
  }, [id]);

  if (!product) return <p>Loading...</p>;

  return (
    <div style={{ padding: "20px" }}>
      <h2>{product.name}</h2>
      <p>Brand: {product.brand}</p>
      <p>Category: {product.category}</p>
      <p>Price: ${product.retailPrice}</p>
      <p>Department: {product.department}</p>
      <Link to="/">Back to Products</Link>
    </div>
  );
};

export default ProductDetail;
