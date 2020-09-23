package com.hsbc.banking.dao;

import java.io.IOException;

public interface FileCopyDao {
    boolean copyFileContent() throws IOException;
}
