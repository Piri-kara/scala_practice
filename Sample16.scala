object Sample16{
  def main(arg: Array[String]){
    // 繰り返し構文
    // iやjの更新を忘れると無限ループになってしまうので絶対に忘れない
    /* while(条件式){
      繰り返したい処理
    }
    条件式がfalseになるまで繰り返す
    */
    println("whileループ")
    var i=0
    while(i<5){
      println(i)
      i += 1
    }

    /* do{
      繰り返したい処理
    }while(条件式)
    条件式の評価がブロックの下にある
    条件式が最初からfalseの時も最低1回は処理を行う
     */
    println("do-whileループ")
    var j=10
    do{
      println(j)
      j += 1
    }while(j<5)
  }
}