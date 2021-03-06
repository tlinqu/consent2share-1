/*******************************************************************************
 * Open Behavioral Health Information Technology Architecture (OBHITA.org)
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package gov.samhsa.consent2share.service.reference;

import gov.samhsa.consent2share.domain.reference.RaceCode;
import gov.samhsa.consent2share.domain.reference.RaceCodeRepository;
import gov.samhsa.consent2share.service.dto.LookupDto;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class RaceCodeServiceImpl.
 */
@Transactional
public class RaceCodeServiceImpl implements RaceCodeService {

	/** The race code repository. */
	RaceCodeRepository raceCodeRepository;

	/** The model mapper. */
	ModelMapper modelMapper;

	/**
	 * Instantiates a new race code service impl.
	 *
	 * @param raceCodeRepository
	 *            the race code repository
	 * @param modelMapper
	 *            the model mapper
	 */
	public RaceCodeServiceImpl(RaceCodeRepository raceCodeRepository,
			ModelMapper modelMapper) {
		super();
		this.raceCodeRepository = raceCodeRepository;
		this.modelMapper = modelMapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.samhsa.consent2share.service.reference.RaceCodeService#findAllRaceCodes
	 * ()
	 */
	@Override
	public List<LookupDto> findAllRaceCodes() {
		List<LookupDto> lookups = new ArrayList<LookupDto>();

		List<RaceCode> raceCodeList = raceCodeRepository.findAll();

		for (RaceCode entity : raceCodeList) {
			lookups.add(modelMapper.map(entity, LookupDto.class));
		}
		return lookups;
	}
}
