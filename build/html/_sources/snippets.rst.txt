astah* Plug-in 用スニペット集
=============================

astah* API用ユーティリティ
-----------------------------

astah* のモデルを操作する際に便利なメソッド群

.. literalinclude:: _snippets/AstahModelUtils.java
   :language: java
   :linenos:

astah* のAPIのハンドリングをまとめたメソッド群

.. literalinclude:: _snippets/AstahAPIUtils.java
   :language: java
   :linenos:

Swingのスニペット集
--------------------

`Java Swingのサンプル <http://terai.xrea.jp/Swing.html>`_


メニューの拡張
-----------------------

詳細はチュートリアル、または同梱されているtutorialexampleプロジェクトを参照してください。

plugin.xmlの例

.. literalinclude:: _snippets/plugin_menu.xml
   :language: xml
   :linenos:

アクションの例

.. literalinclude:: _snippets/HelloWorldAction.java
   :language: java
   :linenos:

拡張ビューの拡張
----------------

詳細はチュートリアル、または同梱されているtutorialexampleプロジェクトを参照してください。

plugin.xmlの例

.. literalinclude:: _snippets/plugin_extraview.xml
   :language: xml
   :linenos:

ビューの例

.. literalinclude:: _snippets/HelloWorldView.java
   :language: java
   :linenos:

Drag and Drop拡張
------------------------

同梱されているcom.change_vision.astah.extension.plugin.drag_and_drop_exampleプロジェクトを参照してください。

プラグインの初期化時にDropTargetListenerを追加するため、Activator#start(BundleContext context)を実装する

.. literalinclude:: _snippets/Activator.java
   :language: java
   :linenos:

DropTargetListenerの実装例

.. literalinclude:: _snippets/ClassDiagramDropExtension.java
   :language: java
   :linenos:

