import { useEffect, useState } from "react";
import { VscError } from "react-icons/vsc";
import CartItem from "../components/cart-items";
import { Link } from "react-router-dom";

const cartItems = [
  {
    productId:"asddddd",
    photo:"https://m.media-amazon.com/images/I/71eXNIDUGjL._SX679_.jpg",
    name:"Macbook",
    price:3000,
    quantity:40,
    stock:10,
  },
];
const subtotal = 4000;
const tax = Math.round(subtotal * 0.18);
const shippingCharges = 200;
const discount = 400;
const total = subtotal + tax + shippingCharges;
const Cart = () => {
  const [couponCode, setCouponCode] = useState<string>("");
  const [isValidCouponCode,setValidCouponCode] =useState<boolean>(false);

  useEffect(() =>{

    const timeOutId = setTimeout(() =>{
     if(Math.random() > 0.5) setValidCouponCode(true);
     else setValidCouponCode(false);
    }, 1000)
    return () =>{
      clearTimeout(timeOutId);
      setValidCouponCode(false);

    }
  }, [couponCode])
  return (
    <div className="cart">
      <main>
        {
          cartItems.length > 0 ?  cartItems.map((i,idx) => (
            <CartItem key={idx} cartItem={i} />
          )): <h1>No item added</h1> }
      </main>
      <aside>
        <p>Subtotal: {subtotal}</p>
        <p>Shipping charges:{shippingCharges} </p>
        <p>Tax: {tax}</p>
        <p>
          Discount:<em> -{discount}</em>
        </p>
        <p>
          <b>Total: {total}</b>
        </p>

        <input type="text" placeholder="Coupon Code" value={couponCode} onChange={(e) => setCouponCode(e.target.value)} />

        {couponCode && (
          isValidCouponCode?(<span className="green">{discount} off using <code>{couponCode}</code></span>):(<span className="red">Invalid Coupon <VscError/></span>
        ))}

        {
          cartItems.length > 0 && <Link to={"/shipping"}>Checkout</Link>
        }
      </aside>
    </div>
  )
}

export default Cart