package com.baeldung.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class JunitBasicTest {

//    @Mock
//    List<String> mockedList;
//
//    @Test
//    public void whenUseMockAnnotation_thenMockIsInjected(){
//        mockedList.add("one");
//        verify(mockedList).add("one");
//        assertThat(0).isEqualTo(mockedList.size());
//
//        when(mockedList.size()).thenReturn(100);
//        assertThat(100).isEqualTo(mockedList.size());
//    }

//    @Spy
//    List<String> spiedList = new ArrayList<>();
//
//    @Test
//    public void whenUseSpyAnnotation_thenSpyIsInjectedCorrectly(){
//
//        spiedList.add("one");
//        spiedList.add("two");
//
//        verify(spiedList).add("one");
//        verify(spiedList).add("two");
//        assertThat(2).isEqualTo(spiedList.size());
//
//        doReturn(100).when(spiedList).size();
//        assertThat(100).isEqualTo(spiedList.size());
//
//    }


    @Mock
    List mockedList;

    @Captor
    ArgumentCaptor argumentCaptor;

    @Test
    public void whenUseCaptorAnnotation_thenTheSam() {

        mockedList.add("one");
        verify(mockedList).add(argumentCaptor.capture());


        assertEquals("one", argumentCaptor.getValue());
//        assertThat("one").isEqualTo(argumentCaptor.getAllValues());
    }


    




}