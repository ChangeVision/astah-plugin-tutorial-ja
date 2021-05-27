
astah*のプラグイン機構の仕組み
=======================================================

.. figure:: images/archtecture.png
   :width: 600
   :alt: astah*プラグインアーキテクチャ

astah*のプラグイン機構は起動時に、インストールフォルダ配下のpluginsフォルダにあるプラグインファイルをロードします。プラグインはOSGi [#osgi]_ Bundle形式のjarファイルである必要があります｡

astah*プラグインの開発中､プラグインフォルダ配下にコピーしなくても良いように、また、Bundleへのパッケージングを自動的に行うなど、開発を楽にする開発環境を用意しています。それではastah*のプラグイン開発環境を構築してみましょう。

このチュートリアルの作成例はexamples/tutorialsampleの下に同梱されています。もしうまく動かない場合は参考にしてください。

.. rubric:: Footnotes

.. [#osgi] `http://www.osgi.org/ <http://www.osgi.org/>`_
