
astah*のプラグインの開発環境を構築しましょう
=======================================================

`astah*のプラグイン開発環境として、astah* Plug-in SDKを配布しています。 <http://astah.change-vision.com/files/plugin/astah-plugin-sdk-latest.zip>`_ このSDKはMaven 3をベースにカスタマイズしたものです。

ここではastah*のプラグインの開発環境を構築しましょう。 `なお、astah*プラグイン開発環境のシステム要件は、astah*に準じます。 <http://astah.change-vision.com/ja/product/astah-requirement.html>`_

まず配布されているastah* Plug-in SDKを適当なフォルダに展開します。次に以下に挙げる環境変数を設定します。

 * 環境変数「ASDK_HOME」を追加し、展開したフォルダを指定する。 ::

     例: set ASDK_HOME=C:\dev\astah-plugin-SDK-1.0

 * 環境変数「PATH」にastah* Plug-in SDKの実行ファイルがある
   「%ASDK_HOME%\\bin」フォルダを追加する。
   (Linux/Mac OS Xでは「$ASDK_HOME/bin」) ::

     例: set PATH=%ASDK_HOME%\bin;%PATH%

環境変数「JAVA_HOME」が指定されていない場合は、`システム要件 <http://astah.change-vision.com/ja/product/astah-requirement.html>`_ を満たすJavaをインストールしてから指定します。

 * 環境変数「JAVA_HOME」を追加し、展開したフォルダを指定する。 ::

     例: set JAVA_HOME=C:\Program Files (x86)\Java\jdk1.7.0_65

 * 環境変数「PATH」に「%JAVA_HOME%\\bin」フォルダを追加する。
   (Linux/Mac OS Xでは「$JAVA_HOME/bin」) ::

     例: set PATH=%JAVA_HOME%\bin;%PATH%

以上の作業が終了したら、次のコマンドを入力してみましょう。 ::

  > asdk

以下のような出力が得られれば､astah* Plug-in SDKのインストールは完了です。 ::

  > astah* Plug-in SDK version: 1.0

次にastah* Plug-in SDKからastah*が起動できることを確認するために、下記のコマンドを入力してみましょう｡ ::

  > astah-launch

うまく行くと、お使いのastah*が起動されます。

.. Warning::
  astah*を起動できない場合は、下記の設定を試してください。
  %ASDK_HOME%\\conf\\settings.xmlの中の<profile>タグに囲まれた部分を設定します。お使いの「エディション」と「OS」に対応する
  ID「astah-<エディション>-<os>」のプロファイルを適切なパスに修正してください。

.. code-block:: xml

   <profile>
     <id>astah-professional-windows</id> <!-- このIDの[professional]はastahのエディション、[windows]はosです -->
     <activation>
       <activeByDefault>false</activeByDefault>
       <file>
         <exists>C:/Program Files/astah-professional/astah-pro.jar</exists>  <!--- ココ -->
       </file>
     </activation>
     <properties>
       <astahPath>C:/Program Files/astah-professional</astahPath>  <!--ココ -->
       <astahEdition>professional</astahEdition>
     </properties>
      <pluginRepositories>
        <pluginRepository>
          <id>local_astah_repository</id>
          <name>Local Astah* Plugin Repository</name>
          <url>file://${env.M2_HOME}/repository/</url>
          <layout>default</layout>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
          <releases>
            <updatePolicy>never</updatePolicy>
          </releases>
        </pluginRepository>
      </pluginRepositories>
    </profile>


.. note::
  astah* Plug-in SDKは､内部でMaven 3を利用しています。
