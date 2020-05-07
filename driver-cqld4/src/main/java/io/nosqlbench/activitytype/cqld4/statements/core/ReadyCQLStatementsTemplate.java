package io.nosqlbench.activitytype.cqld4.statements.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadyCQLStatementsTemplate {

    private List<ReadyCQLStatementTemplate> readyStatementList = new ArrayList<>();

    public void addTemplate(ReadyCQLStatementTemplate t) {
        this.readyStatementList.add(t);
    }

    public List<ReadyCQLStatement> resolve() {
        return readyStatementList.stream()
                .map(ReadyCQLStatementTemplate::resolve)
                .collect(Collectors.toList());
    }

    public int size() {
        return readyStatementList.size();
    }

}