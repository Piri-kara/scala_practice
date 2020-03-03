object Sample32{
  def main(args: Array[String]){
    val ant=new Ant
    val bee=new Bee
    ant.move()
    bee.move()
  }
}


// スーパークラスのあるメソッドをサブクラスでオーバーライドした場合、
// サブクラスのインスタンスはスーパークラスから受け継いだメソッドとサブクラスでオーバーライドしたメソッドの両方を持っている
// オーバーライドしたメソッドの方が優先順位が高い
// スーパークラスから受け継いだメソッドを使用したい場合は、「super.メソッド名」と記述することで使える
class Insect(val kind:String){
  def move(){
    println(kind+"が歩きました。")
  }
}
class Ant extends Insect("アリ")
class Bee extends Insect("ハチ"){
  override def move(){
    super.move()
    println(kind+"が飛びました。")
  }
}