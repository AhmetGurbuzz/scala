package tastytest

class Defaults(val i: Int = 33, val s: String = "foo")(val b: Boolean = false) {
  def foo(a: Int = 0)(b: String = "")(c: Boolean = false) = (a,b,c)
}

object Defaults {
  def apply(i: Int = 33, s: String = "foo")(b: Boolean = false): Defaults = new Defaults(i,s)(b)

  class Specialised extends Defaults(12,"abc")(true) {
    def bar(d: Long = i.toLong) = (d,s,b)
  }
}
