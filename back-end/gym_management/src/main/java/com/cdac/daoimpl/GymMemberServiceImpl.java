package com.cdac.daoimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.GymMemberService;
import com.cdac.dao.GymMemberDao;
import com.cdac.pojos.GymMember;
import com.cdac.pojos.User;



@Transactional
@Service
public class GymMemberServiceImpl implements GymMemberService{

	
	  @Autowired 
		private GymMemberDao gymMemberDao;
	  
	  @Override
		public GymMember findById(int memberId) {
			Optional<GymMember> b = gymMemberDao.findById(memberId);
			return b.orElse(null);
		}
	  
	  @Override
		public List<GymMember> findAll() {
			return gymMemberDao.findAll();
		}

		@Override
		public GymMember save(GymMember gm) {
			return gymMemberDao.save(gm);
		}
		
		@Override
		public GymMember update(GymMember gm) {
			return gymMemberDao.save(gm);
		}

		@Override
		public void deleteById(int memberId) {
			gymMemberDao.deleteById(memberId);

		}

}
