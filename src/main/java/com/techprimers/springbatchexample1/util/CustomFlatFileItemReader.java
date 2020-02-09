package com.techprimers.springbatchexample1.util;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CustomFlatFileItemReader<T> extends FlatFileItemReader<T> {

    private InputStream stream;

    @Override
    public void setResource(Resource resource) {
        // Create springbatch input stream resource
        InputStreamResource res = new InputStreamResource(stream);

        // Set resource
        super.setResource(res);
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }
}
