package id.nexbyte.erp.core.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import id.nexbyte.erp.core.validation.NullOrNotBlank;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class BranchDto implements Serializable {

    private static final long serialVersionUID = 5163248791123824931L;

    @Null
    private UUID id;

    @NotBlank
    private String name;

    @Size(max = 100)
    @NullOrNotBlank
    private String address;

    @Size(max = 25)
    @NullOrNotBlank
    private String phoneNumber;

    private UUID managerId;

    @Null
    private UUID createdBy;

    @Null
    private UUID updatedBy;

    @Null
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
    private OffsetDateTime createdAt;

    @Null
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
    private OffsetDateTime updatedAt;
}
