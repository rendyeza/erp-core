package id.nexbyte.erp.core.entity.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public abstract class BaseEntity extends AuditEntity {
    @Type(type = "pg-uuid")
    @Column(name = "created_by", nullable = false, updatable = false)
    private UUID createdBy;

    @Type(type = "pg-uuid")
    @Column(name = "updated_by", nullable = false)
    private UUID updatedBy;

    @Column(name = "is_deleted", columnDefinition = "boolean default false")
    private boolean isDeleted;

    public BaseEntity(UUID createdBy, UUID updatedBy) {
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.isDeleted = false;
    }
}
