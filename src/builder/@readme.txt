■builderパターン
 -- XXXXXXXXXX

＜説明＞
 [XXXXX]
  ・XXXX
  ・XXXX
  ・XXXX
 [XXXXXX]
  ・XXXX

＜ポイント＞
  ・templateMethodパターンに似ている。templateMethodパターンでは親クラスにアルゴリズムを記載。
　　builderパターンでは別クラス（当例題ではDirectorクラス）に記載。
　・上記により、抽象クラスではなくインタフェースとして定義。
