import Hello from './components/hello'
import './App.css'
import Addition from './components/functional/addition'
import SayHello from './components/functional/example1'
import ClassExample from './components/class/example1'
import Form from './components/functional/form'
import Table from './components/functional/table'
import Cards from './components/class/card'
import MoneyConverter from './components/Nested/MoneyConverter'
import ExampleProps from './Props/example1'
import Parent from './Props/example2'
import StudentData from "./Props/studentData"
import item from "./Props/data"
import Sum from './Props/ProtoTypes/example1'
import Welcome from './state/example'
import GreetingMessage from './Event_Binding/example1'
import Clock from './API/example'
import Initialization from './state/initialization'
import IfElse from './conditionalRendering/example1'
import UsingState from './conditionalRendering/usingState'
import Ternary from './conditionalRendering/ternarOpera'
import FormValidation from './Hooks/useState/formValidation'
import SaysHello from './Hooks/hello'
import List from './Hooks/useEffect/list'
import Counter from './Hooks/useState/Counter'
import WindowSize from './Hooks/useEffect/WindowSize'
import Summation from './Hooks/useMemo/Sum'
import ProgressBar from './Challenge/progressBar'
import FetchData from './Challenge/fetchData'
function App() {

  return (
    <div className='app'>
      <Hello />
      <SayHello />
      <Addition />
      <Table />
      <Form />
      <ClassExample />
      <Cards />
      <MoneyConverter amount={100} type="can" />
      <ExampleProps user="Faiz Ahmad" />
      <Parent />
      <StudentData item={item} />
      <Sum num1={10} num2={30} />
      <Welcome name="Faiz Ahmad" />
      <GreetingMessage name="Shaikh Tahoora" />

      {/* <Clock/> */}
      <Initialization />
      <IfElse isLoggedIn={false} />
      {/* <UsingState/> */}
      <Ternary />
      <FormValidation />

      <SaysHello />
      <List />
      <Counter />
      <WindowSize />
      <Summation />
      <ProgressBar />
      <FetchData />
    </div>
  )
}

export default App
