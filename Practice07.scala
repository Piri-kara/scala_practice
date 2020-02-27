object Practice07{
  def main(args: Array[String]){
    // インスタンスを建てる時に引数を渡す
    // クラス定義部分で、引数を受ける形で定義しておく
     val tshirt = new TShirt("黒", "L", 2980)
     println("本日セールのTシャツ")

     tshirt.information()
     
     tshirt.changePrice(1480)
     
     println("プライスダウン後のTシャツ")
     
     tshirt.information()
  }
}

// クラスパラメータとインスタンスフィールド名は別
// クラスパラメータはc,s,p
// インスタンスフィールド名はcolor,size,price
class TShirt(c:String, s:String, p:Int){
  val color = c
  val size = s
  var price = p
  
  // 引数で受け取った値でクラスパラメータを更新する
  def changePrice(newPrice:Int)={
    price = newPrice
  }
  // 引数は受け取らないはずだが、()が無いとエラーになる
  def information(){
    println(" 色："+color+" サイズ："+size+" 価格："+price+"円")

  }
}