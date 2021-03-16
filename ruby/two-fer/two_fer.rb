class TwoFer
  def self.two_fer(name = 'you')
    "One for #{name}, one for me."
  end
end

if defined? Minitest

  describe 'Mentor Bug Fighting Test' do

    it 'must use the name when given nil' do
      actual = TwoFer.two_fer(nil)
      expected = 'One for , one for me.'
      expect(actual).must_equal expected
    end

    it 'must use an empty Array as a name if given' do
      actual = TwoFer.two_fer([])
      expected = 'One for [], one for me.'
      expect(actual).must_equal expected
    end

    it 'must use an empty Hash as a name if given' do
      actual = TwoFer.two_fer({})
      expected = 'One for {}, one for me.'
      expect(actual).must_equal expected
    end

    it 'must use an empty String as a name if given' do
      actual = TwoFer.two_fer('')
      expected = 'One for , one for me.'
      expect(actual).must_equal expected
    end

  end

end
