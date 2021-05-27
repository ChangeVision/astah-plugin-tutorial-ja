
拡張タブビューを作ってみましょう
=======================================================

astah*プラグインには拡張タブビューがあります。これを使うと、例えばクラス情報のサマリを一覧にしてastah*上で閲覧できるプラグインを作成できます。ここでは、”Hello World”という文字列を表示する拡張タブビューを作成する方法を紹介します。

.. figure:: images/extend-view.png
   :width: 503
   :alt: 拡張タブビューの例
   
拡張タブビューを実装しましょう
----------------------------------------------------------

拡張タブビューはIPluginExtraTabViewインターフェースの実装クラスとして定義します。次のソースコードは、IPluginExtraTabViewを実装したHelloWorldViewの例です。

.. literalinclude:: _snippets/HelloWorldView.java
   :language: java
   :linenos:
 
getComponent()は表など拡張タブビュー上に表示されるコンテンツをastah*に返します。例では、拡張タブビュー上に”Hello World”を表示するHelloWorldViewインスタンスを返しています。拡張タブビューのタイトルはgetTitle()で定義します。

ProjectEventListenerインターフェースを実装したクラスは、astah*が現在開いているモデルのオブザーバーです。クラスの追加や削除などモデルに変更があった場合、projectChangedメソッドが呼ばれます。

拡張タブビューをastah*に追加しましょう
-------------------------------------------------------

続いてplugin.xmlに拡張タブビューを追加しましょう。

.. literalinclude:: _snippets/plugin_extraview.xml
   :language: xml
   :linenos:

各タグの意味は下記のとおりです。

=================== ========= ======== =============================================
Tag Name            Attribute Required  Description                                 
=================== ========= ======== =============================================
extension            \          ○      拡張ポイントを指定します｡                   
\                    point      ○      com.change_vision.astah.ui.viewを指定       
view                 \          ○      ビューを指定します。                        
\                    id         ○      ビューのIDです。                            
\                    type       ○      表示する場所を指定します｡
\                    \          \       拡張ビューの場合､extraTabを指定します。
\                    class      ○      拡張タブに表示する実装クラスを指定します｡   
=================== ========= ======== =============================================

これで拡張タブビューを追加できました。

