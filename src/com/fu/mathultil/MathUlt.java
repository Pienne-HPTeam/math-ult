/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathultil;
import com.fu.mathultil.MathUtility;
/**
 *
 * @author atbgl
 */
public class MathUlt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalAccessException {
        // TODO code application logic here
//        int n = 5;
//        long expected = 120;
//        long actual = MathUtility.getFactorial(n);
//        // mình so sánh đúng sai
//        System.out.println("expected 5!: "+ expected + "; actual: "+ actual);
        
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        // mình so sánh đúng sai
        System.out.println("expected 0!: "+ expected + "; actual: "+ actual);
        
        //Cách 4: Máy ơi so sánh dùm tao luôn vì mày cóc các phép toán để so sánh được
        // Vậy con người không cần nhìn từng dòng kết quả để luận đúng sai , máy sẽ lo cho
        //Nếu tất cả đều đúng , hàm đúng , màu xanh
        // hầu hết các hàm chạy đều đúng , có 1 cái sai --> sai --> màu đỏ
        //đỏ chi cần 1 thằng sai
        //xanh: tất cả đều đúng
        //Muốn là được điều này ta cần thư viện phụ trợ giúp cho java xanh đỏ
        //điều này cũng có bên C#, PHP, JS, Ruby,...
        //Java: JUnit, TestNG
        //C#: NUnit, MSTest
        //PHP: PHPUnit
    }
}
