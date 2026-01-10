package com.edutech.progressive.repository;
 
import java.util.Optional;
 
import javax.transaction.Transactional;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
import com.edutech.progressive.entity.Supplier;
 
@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
 
    void deleteBySupplierId(@Param("supplierId") int supplierId);
 
    Supplier findBySupplierId(@Param("supplierId") int supplierId);
 
    Supplier findByUsername(String username);
 
    Supplier findByEmail(String email);
}