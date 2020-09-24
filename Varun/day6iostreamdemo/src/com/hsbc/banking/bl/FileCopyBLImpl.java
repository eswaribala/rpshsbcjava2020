package com.hsbc.banking.bl;

import com.hsbc.banking.dao.FileCopyDao;
import com.hsbc.banking.dao.FileCopyImpl;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopyBLImpl implements FileCopyBl{

    private FileCopyDao fileCopyDao;

    public FileCopyBLImpl(String readFileName, String writeFileName) throws FileNotFoundException {
        fileCopyDao = new FileCopyImpl(readFileName, writeFileName);
    }

    @Override
    public boolean copyFileContent() throws IOException {
        return fileCopyDao.copyFileContent();
    }
}
