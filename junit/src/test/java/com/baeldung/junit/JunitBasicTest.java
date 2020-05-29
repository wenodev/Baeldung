package com.baeldung.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class JunitBasicTest {

    @Mock
    List<String> mockedList;

    @Test
    public void whenUseMockAnnotation_thenMockIsInjected() {
        mockedList.add("one");
        verify(mockedList).add("one");
        assertThat(mockedList.size()).isEqualTo(0);
        System.out.println(mockedList.size());


        when(mockedList.size()).thenReturn(10);
        assertThat(mockedList.size()).isEqualTo(10);
        System.out.println(mockedList.size());
    }

    @Spy
    List<String> spiedList = new ArrayList<String>();

    @Test
    public void




}