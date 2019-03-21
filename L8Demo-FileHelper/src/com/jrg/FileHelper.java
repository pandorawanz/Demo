/*
创建一个FileHelper类,其中只有一个静态方法 copy, 其功能为:
        1.接受两个参数, 参数类型都为File: file1, file2.
        2.意思为把file1的内容写入到file2中.
*/
package com.jrg;

import java.io.IOException;

public class FileHelper {
    public static void copy(File file1, File file2) throws IOException {
        file2.writeString(file1.readToString());
    }
}
