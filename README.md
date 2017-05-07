loginapp
=======================

Spring Boot でログイン画面、アカウント新規登録画面がある Webアプリケーションです。

* 構成要素は、Spring Boot + Spring Web MVC + Thymeleaf + Spring Security です。
* DB は PostgreSQLです。
* テーブルは User、カラムは userIdとpasswordの２つのみです。
* ログイン画面では Spring Security を使用しています。
* 登録画面では無条件で登録可能としており、Serviceとして実装しています。

* /loginFormがログイン画面で、/EntryFormがアカウント新規登録画面です。
