package com.heima.opencv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

/**
 * 测试OpenCV的可用性
 */
public class Test {
    //用来调用OpenCV库文件,必须添加
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String args[]) {
        System.out.println("输出一个3X3的对角矩阵");
        Mat a = Mat.eye(3, 3, CvType.CV_8UC1); //输出一个3X3的对角矩阵
        System.out.println(a.dump());
    }
}
