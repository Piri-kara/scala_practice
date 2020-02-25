object Practice03{
  def main(args: Array[String]){
    // 答え変数（1から10までの値をランダムに設定）
    val answer = scala.util.Random.nextInt(10)+1
    // 3回答えられるので、初期値3のvar変数iを定義
    var i=3
    // iが0より大きければ繰り返す
    while(i > 0){
      // 入力値の受付
      println("数値を入力してください（残り"+i+"回）")
      val input = scala.io.StdIn.readInt
      // 正解か不正解かで場合分け
      if(answer == input){
        // 正解の場合、i=0として処理を終了させる
        println("正解です！正解は"+answer+"でした！")
        i = 0
      }
      // 不正解の場合
      else{
        // iの値を更新
        i -= 1
        // iがいくつかで場合分け
        if(i == 0){
          // 回答権がなくなった場合、処理終了
          println("残念・・・正解は"+answer+"でした！")
        }
        else{
          // answerとinputの大小関係でヒントを与える
          // 入力値の受付に戻る
          if(answer<input){
            println("答えは"+input+"よりも小さい値です")
          }
          else{
            println("答えは"+input+"よりも大きい値です")
          }
        }
      }
    }

  }
}