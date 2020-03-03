object Sample31{
  def main(args: Array[String]){
    val dog=new Dog
    val cat=new Cat
    val pla=new Playpus
    dog.birth()
    cat.birth()
    pla.birth()
  }
}
class Mammal(val kind:String){
  def birth(){
    println(kind+"が赤ちゃんを産みました。")
  }
}

class Dog extends Mammal("犬")
class Cat extends Mammal("猫")
class Playpus extends Mammal("カモノハシ"){
  // overrideすることで、スーパークラスのbirthメソッドを上書きしている
  override def birth(){
    println(kind+"が卵を産みました。")
  }
}