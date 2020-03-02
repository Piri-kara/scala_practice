object Sample27{
  def main(args: Array[String]){
    val j1=new Japanese("山田")
    val j2=new Japanese("田中")

    Japanese.situation()

    val j3=new Japanese("中西")
    val j4=new Japanese("西田")

    Japanese.situation()
    j4.introduce()
  }
}

// コンパニオンクラス・オブジェクト
// シングルトンオブジェクトはそれ自体がオブジェクトであり、たった1つしか存在し得ない
// シングルトンオブジェクト名はシングルトンオブジェクトの居場所を指す参照変数のようなもの

// 同一のソースファイルであれば、同じ名前のシングルトンオブジェクトとクラスを定義できる。
// この状態のシングルトンオブジェクトをコンパニオンオブジェクト、この状態のクラスをコンパニオンクラスと言う

// コンパニオンオブジェクトとコンパニオンクラスは関連があるため、互いのprivateなフィールド・メソッドにもアクセス可能

// インスタンスごとに必要なフィールド・メソッドはコンパニオンクラスに記述、全てのインスタンスで共通なフィールド・メソッドはコンパニオンオブジェクトに記述


// Japaneseコンパニオンオブジェクト
// 全てのインスタンスに共通する通過と首都の情報はコンパニオンオブジェクトに宣言
object Japanese{
  private var total=0
  val currency="円"
  val capital="東京"
  def situation(){
    println("現在の日本人の総人口は "+total+" 人です。")
  }
}

// Japaneseコンパニオンクラス
class Japanese(private val name:String){
  // 基本コンストラクタの処理を記述 インスタンス化される度にJapaneseコンパニオンオブジェクトのprivateなvarフィールドをインクリメントする
  Japanese.total += 1
  def introduce(){
    print("私の名前は")+name+"、"
    print("日本人なので通過は"+Japanese.currency)
    print("、首都は"+Japanese.capital+"です。")
  }
}