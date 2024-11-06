import { Link } from "react-router-dom"
import ProductCard from "../components/product-card"

const Home = () => {
  const addToCartHandler = () =>{};
 return <div className="home">
  <section>

  </section>

<h1>Latest Products <Link className="findmore" to={"/search"}>More</Link></h1>


<main>
  <ProductCard productId="ajasjsjsj" name="macbook" price={23636} stock={23} photo={"https://m.media-amazon.com/images/I/71eXNIDUGjL._SX679_.jpg"} handler={addToCartHandler}
      />
</main>
 </div>
}

export default Home