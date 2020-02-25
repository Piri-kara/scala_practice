object Sample15{
  def main(args: Array[String]){

    // if式は値を返すことができる
    // 変数monthの値に応じて、seasonへ文字列リテラルを代入している
    val month=7
    val season=
    if(month>=3&&month<=5){
      "春"
    }
    else if(month>=6&&month<=8){
      "夏"
    }
    else if(month>=9&&month<=11){
      "秋"
    }
    else if(month==12||month==1||month==2){
      "冬"
    }
    else{
      "不明"
    }
    println(month+"月は"+season+"です")
  }
}