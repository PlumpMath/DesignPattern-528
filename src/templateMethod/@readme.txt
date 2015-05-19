■第3章 Template Method
  -- 具体的な処理をサブクラスにまかせる

＜説明＞
 [AbstractDisplay]
  ・open,print,closeのメソッドはabstractとし、具体的な処理は子クラスに記述する。
  ・displayメソッドでopen,print,closeを使用し、ロジックを記述する。
  ・displayメソッドがtemplateMethodとなる。
 [CharDisplay、StringDisplay]
  ・AbstractDisplayのopen,print,closeの具体的な実装を記述する。

＜ポイント＞
  ・displayメソッドにアルゴリズムを記載するが、具体的にやりたいことは外に出すので再利用しやすい。
