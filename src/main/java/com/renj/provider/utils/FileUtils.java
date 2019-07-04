package com.renj.provider.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        List<T> result = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            result.add(JsonUtils.jsonToBean(line, clazz));
        }
        bufferedReader.close();
        return result;
    }

    public static void main(String[] args) throws IOException {

    }
}
