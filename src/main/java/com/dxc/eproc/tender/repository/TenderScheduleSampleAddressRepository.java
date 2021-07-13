package com.dxc.eproc.tender.repository;

import com.dxc.eproc.tender.domain.TenderScheduleSampleAddress;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TenderScheduleSampleAddress entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TenderScheduleSampleAddressRepository extends JpaRepository<TenderScheduleSampleAddress, Long> {}
