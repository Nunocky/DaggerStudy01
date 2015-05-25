package org.nunocky.daggerstudy01;

import android.content.Context;

import org.nunocky.daggerstudy01.debugger.Debugger;
import org.nunocky.daggerstudy01.debugger.ToastDebugger;

import dagger.Module;
import dagger.Provides;


// 設定ファイルに当たるModuleを作成する(DebuggerModule)

// モジュールにあたるクラスではいくつか規則があり，まず Moduleアノテーションで
// インジェクションするクラスを指定する．今回は MainActivity上で実行するので
// MainActivityを指定する．
//
// そして Injectして何を注入するか決めるために[provide+(型名)]の命名規則の
// メソッドを作成し実装をリターンする.

@Module(injects = MainActivity.class)
public class DebuggerModule {
    Context mContext;

    public DebuggerModule(Context context) {
        mContext = context;
    }

    @Provides
    Debugger provideDebugger() {
        return new ToastDebugger(mContext);
    }
}
