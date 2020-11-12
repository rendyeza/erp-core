package id.nexbyte.erp.core.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class BranchPagedList extends PageImpl<BranchDto> implements Serializable {
    private static final long serialVersionUID = 1007315698944552834L;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public BranchPagedList(
        @JsonProperty("content") List<BranchDto> content,
        @JsonProperty("number") int number,
        @JsonProperty("size") int size,
        @JsonProperty("totalElements") Long totalElements,
        @JsonProperty("pageable") JsonNode pageable,
        @JsonProperty("last") boolean last,
        @JsonProperty("totalPages") int totalPages,
        @JsonProperty("sort") JsonNode sort,
        @JsonProperty("first") boolean first,
        @JsonProperty("numberOfElements") int numberOfElements
    ) {
        super(content, PageRequest.of(number, size), totalElements);
    }

    public BranchPagedList(List<BranchDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BranchPagedList(List<BranchDto> content) {
        super(content);
    }
}
