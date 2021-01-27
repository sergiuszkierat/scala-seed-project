package example

object Hello extends Greeting with App {
  println(greeting)
  for (x <- 1
    to 10) {println(x)}
}

trait Greeting {
  lazy val greeting:


    String = "hello"
}
