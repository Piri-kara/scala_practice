object Practice07{
  def main(args: Array[String]){
     val tshirt = new TShirt("黒", "L", 2980)
     println("本日セールのTシャツ")

     tshirt.information()
     
     tshirt.changePrice(1480)
     
     println("プライスダウン後のTシャツ")
     
     tshirt.information()
  }
}

class TShirt(c:String, s:String, p:Int){
  val color = c
  val size = s
  var price = p

  def changePrice(newPrice:Int)={
    price = newPrice
  }
  def information(){
    println(" 色："+color+" サイズ："+size+" 価格："+price+"円")

  }
}