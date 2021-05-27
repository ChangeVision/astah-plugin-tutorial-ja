プラグインをリリースしましょう
===============================

プラグインのリリース前に、開発したastah*のバージョンと、動作対象エディションを設定しておきましょう。設定を行うと、対象にしないastah*環境にインストールされても、プラグインを起動しません。リリースする前に、開発したastah*のバージョンと動作対象エディションを設定しておきましょう。この設定があると、対象としないastah*環境にインストールされた場合、プラグインが起動されません。

pom.xmlを開き、<properties>タグのastah-versionとastah-editionに指定します。

.. code-block:: xml

  <properties>
    <bundle.symbolicName>com.change_vision.astah.sample</bundle.symbolicName>
    <bundle.namespace>com.change_vision.astah</bundle.namespace>
    <plugin.install>true</plugin.install>
    <astah.version>6.6</astah.version>
    <astah.edition>all</astah.edition>
  </properties>

astah.versionには開発に利用したastah*のバージョンを書きましょう。空欄にした場合は、全てのバージョンが動作対象となります。astah-editionに指定するキー名は、下記の表を参照してください。

================== =======================================
Edition             Value
================== =======================================
全エディション対応 空欄、またはallか、* (astah.versionは1.1にしてください)
professional       pro、またはprofessional
UML                uml、またはUML
SysML              sysml
community          com、またはCommunity
think              think
================== =======================================
