package com.example.junittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaluculatorTest {
    /*
    * @Before
    *  メソッド名はsetUp()で定義されている。
    *  初期化メソッド実行前の処理(メソッド毎に必ず呼ばれる)
    *  引数を持たないpublicメソッドにする
    * @Test
    *  テストメソッドの宣言。
    *  引数を持たないpublicメソッドにする
    *  @Test(expected=Exception.class)で例外が出るテスト
    * @After
    *  メソッド名はtearDownで定義されている
    *  後処理メソッド実行後の処理(メソッド毎に必ず呼ばれる)
    *  引数を持たないpublicメソッドにする
    *  必ず行わないといけない後処理を記載する
    * @Ingnore
    *  テスト実行除外
    *  一時的に実行したくないときに使う
     * */

    private Caluculator mCaluculator;

    @Before
    public void setUp() throws Exception {
        // インスタンス生成
        mCaluculator = new Caluculator();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(2, mCaluculator.sum(1,6), 0);
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(3, mCaluculator.substract(5,3), 0);
    }
}