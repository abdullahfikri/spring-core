package dev.mfikri.spring.core.data;

import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Getter
public class MultiFoo {
    private List<Foo> foos;

    public MultiFoo(ObjectProvider<Foo> objectProvider) {
        this.foos = objectProvider.stream().collect(Collectors.toList());
    }
}
