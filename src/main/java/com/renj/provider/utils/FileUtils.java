package com.renj.provider.utils;

import com.renj.provider.common.ApplicationCommon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-04   16:18
 * <p>
 * 描述：文件操作工具类
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
public class FileUtils {

    public static List<String> readFileToListString(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(ApplicationCommon.ROOT_DIR_DATA + File.separator + filePath));
        List<String> result = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            result.add(line);
        }
        bufferedReader.close();
        return result;
    }

    /**
     * 将文件数据组装成集合
     *
     * @param filePath
     * @param clazz
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> List<T> readFileToListBean(String filePath, Class<T> clazz) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(ApplicationCommon.ROOT_DIR_DATA + File.separator + filePath));
        List<T> result = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            result.add(JsonUtils.jsonToBean(line, clazz));
        }
        bufferedReader.close();
        return result;
    }

    public static <T> List<T> readFileToListBean(String filePath, int startIndex, int endIndex, Class<T> clazz) throws IOException {
        filePath = ApplicationCommon.ROOT_DIR_DATA + File.separator + filePath;
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(filePath));

        List<T> result = new ArrayList<>();
        String line = lineNumberReader.readLine();
        int lineNumber = lineNumberReader.getLineNumber();
        while (line != null) {
            if (lineNumber <= startIndex && lineNumber > endIndex) {
                if (!CheckUtils.isEmpty(line))
                    result.add(JsonUtils.jsonToBean(line, clazz));
            }
            if (lineNumber >= startIndex) break;

            line = lineNumberReader.readLine();
            lineNumber = lineNumberReader.getLineNumber();
        }
        lineNumberReader.close();
        // 倒序排列
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) throws IOException {
    }
}
