object Practice06{
  def main(args: Array[String]){
    val book=new Book
    book.title = "楽しいScala"
    book.author = "山田太郎"
    book.price = 2980
    println(book.getInfo)
  }
}

class Book{
  var title=""
  var author=""
  var price=0
  // 本の情報をString型で返すgetInfoメソッド
  // def メソッド名(引数):結果型={}
  // メソッド内でprintlnする際は、結果値を記述する必要ない
  def getInfo:String={
    "タイトル："+title+"\n"+"著者："+author+"\n"+"価格："+price+"円"
  }
}