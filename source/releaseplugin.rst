プラグインをリリースしましょう
===============================

プラグインのリリース前に、行っておきたい設定を行いましょう。

動作対象のバージョンとエディションの設定
----------------------------------------

astah*のバージョンと動作対象エディションを設定すると、対象にしないastah*環境にインストールされても、プラグインを起動しません。リリースする前に、開発したastah*のバージョンと動作対象エディションを設定しておきましょう。この設定があると、対象としないastah*環境にインストールされた場合、プラグインが起動されません。

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

================== ==========================
Edition             Value
================== ==========================
全エディション対応 空欄、またはallか、* [1]_
professional       pro、またはprofessional
UML                uml、またはUML
SysML              sysml
community          com、またはCommunity
think              think
================== ==========================

プラグインの名称と説明の変更
----------------------------

astah*にプラグインをインストールすると、プラグイン一覧に表示されます。この、プラグイン一覧に表示される内容は、src/main/resources/OSGI-INF/l10nフォルダの下にあるbundle.properties、bundle_ja.propertiesに記述されたものです。bundle_ja.propertiesは、plugin_ja.propertiesと同様、日本語環境でastah*が起動した時に読み込みます。その他の言語に対応させる場合は、ロケールごとにプロパティファイルを用意してください。KeyとValueを解説します。

================== ==========================
Key                 Value
================== ==========================
bundle.name         プラグインの名前
bundle.description  プラグインの説明
================== ==========================

.. [1] astah.versionはSysMLに対応させるため、1.1にしてください
