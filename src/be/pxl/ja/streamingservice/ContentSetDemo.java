package be.pxl.ja.streamingservice;

import be.pxl.ja.ContentRepository;

public class ContentSetDemo {
    public static void main(String[] args) {
        ContentRepository contentRepository = new ContentRepository();
        System.out.println(contentRepository.getContentSet());
    }
}
