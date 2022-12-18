package org.zerock.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SolutionTest {

    @Inject
    String sentence = "hellopython";

    @Inject
    String key = "abcdefghijk";

    @Inject
    int rotation = 3;
    
    @Test
    public void main(String[] args) {        
        solution(sentence, key, rotation);
    }
    public String solution(String encrypted_text, String key, int rotation) {
        String answer = "";
        return answer;
    }
}
